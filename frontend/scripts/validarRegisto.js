// Nome
$('#nome').on('input', function() {
	var input=$(this);
    var valid=input.val();
    var error_element=$("span", input.parent());
    if(valid){
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
    else{
        input.removeClass("valid").addClass("invalid");
        error_element.removeClass("error").addClass("error_show");
    }
});

// Email
$('#email').on('input', function() {
	var input=$(this);
	var re = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
	var valid=re.test(input.val());
    var error_element=$("span", input.parent());
    if(valid){
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
    else{
        input.removeClass("valid").addClass("invalid");
        error_element.removeClass("error").addClass("error_show");
    }
});

// Password
$('#password').on('input', function() {
	var input=$(this);
	var re = /^.{5,}$/;
	var valid=re.test(input.val());
    var error_element=$("span", input.parent());
    if(valid){
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
    else{
        input.removeClass("valid").addClass("invalid");
        error_element.removeClass("error").addClass("error_show");
    }
});

// Contacto
$('#contacto').on('input', function() {
	var input=$(this);
	var re = /^\+?[0-9]{9,}$/;
	var valid=re.test(input.val());
    var error_element=$("span", input.parent());
    if(valid){
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
    else{
        input.removeClass("valid").addClass("invalid");
        error_element.removeClass("error").addClass("error_show");
    }
});

// Fotografia
$('#pic').on('input', function() {
    var input=$(this);
    var error_element=$("span", input.parent());

    if(input.val()){
        if (input.val().substring(0,4)=='www.'){input.val('http://www.'+input.val().substring(4));}
        var re = /(http|ftp|https):\/\/[\w-]+(\.[\w-]+)+([\w.,@?^=%&:\/~+#-]*[\w@?^=%&\/~+#-])?/;
        var valid=re.test(input.val());
        if(valid){
            input.removeClass("invalid").addClass("valid");
            error_element.removeClass("error_show").addClass("error");
        }
        else{
            input.removeClass("valid").addClass("invalid");
            error_element.removeClass("error").addClass("error_show");
        }
    }
    else {
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
});

// Data Nascimento
$('#datanascimento').on('input', function() {
    var input=$(this);
    var error_element=$("span", input.parent());
    var parts = input.val().split('-');
    var birthday = new Date(parts[0], parts[1] - 1, parts[2]); 
    var ageDifMs = Date.now() - birthday.getTime();
    var ageDate = new Date(ageDifMs); // miliseconds from epoch
    var age = Math.abs(ageDate.getUTCFullYear() - 1970);
    if(age >= 18){
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
    else{
        input.removeClass("valid").addClass("invalid");
        error_element.removeClass("error").addClass("error_show");
    }
});

// Morada
$('#morada').on('input', function() {
	var input=$(this);
    var valid=input.val();
    var error_element=$("span", input.parent());
    if(valid){
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
    else{
        input.removeClass("valid").addClass("invalid");
        error_element.removeClass("error").addClass("error_show");
    }
});

// Distrito
$('#distrito').on('input', function() {
	var input=$(this);
    var valid=input.val();
    var error_element=$("span", input.parent());
    if(valid){
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
    else{
        input.removeClass("valid").addClass("invalid");
        error_element.removeClass("error").addClass("error_show");
    }
});

// Concelho
$('#concelho').on('input', function() {
	var input=$(this);
    var valid=input.val();
    var error_element=$("span", input.parent());
    if(valid){
        input.removeClass("invalid").addClass("valid");
        error_element.removeClass("error_show").addClass("error");
    }
    else{
        input.removeClass("valid").addClass("invalid");
        error_element.removeClass("error").addClass("error_show");
    }
});

// After Form Submitted Validation
$("#registo_submit button").click(function(event){
	var form_data=$("#registoForm").serializeArray();
	var error_free=true;
	for (var input in form_data){
        var element=$("#" + form_data[input]['name']);
        var error_element=$("span", element.parent());

        // A fotografia é válida se não estiver preenchida
        if(form_data[input]['name'] == "pic"){
            if(!element.val()){
                element.removeClass("invalid").addClass("valid");
                error_element.removeClass("error_show").addClass("error");
            }
        }

        var valid=element.hasClass("valid");

		if (!valid){
            console.log(form_data[input]['name'])
            error_element.removeClass("error").addClass("error_show"); 
            error_free=false;
            element.removeClass("valid").addClass("invalid");
        }
		else{
            error_element.removeClass("error_show").addClass("error");
            element.removeClass("invalid").addClass("valid");
        }
	}
	if (!error_free){
        // Get the snackbar DIV
        var x = document.getElementById("snackbar");

        // Change content
        x.textContent = "Preencha o formulário corretamente."

        // Add the "show" class to DIV
        x.className = "show";

        // After 3 seconds, remove the show class from DIV
        setTimeout(function () { x.className = x.className.replace("show", ""); }, 3000);
	}
	else{
		$("#confirmarPerfil").modal('toggle');
	}
});