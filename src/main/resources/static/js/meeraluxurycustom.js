(function ( $ ) {

	$(function () {
	  $('#datetimepicker').datetimepicker({
	      format: 'DD MMM YYYY',
	      defaultDate:'now'
	    });
	});

	$(function() {
	  	// Setup form validation on the #register-form element
	    $("#dailyupdate-form").validate({
	    	// Specify the validation rules
	        rules: {
	            busnumber: "required"
	        },
	        
	        // Specify the validation error messages
	        messages: {
	            busnumber: "Please select bus number"
	        },
	        
	        submitHandler: function(form) {
	            form.submit();
	        }
	    });

  	});

	//function to add all income fields in daily updates view
	$(function () {
		$('.income').blur(function () {
		    var totalincome = 0;
		    $('.income').each(function() {
		        if($(this).val()!="")
		         {
		            totalincome += parseFloat($(this).val());
		         }

		    });
		    $( "#totalincome" ).html( "<span id='tincome' data-tincome='"+totalincome+"'><h3>Total Income: "+totalincome+"</h3>" );
		    var saving = totalincome - parseFloat($("#texpense").data("texpense"));
		    if(saving>0){
		    	$( "#totalsaving" ).attr("style", "color:green");
		    }else if(saving<0){
		    	$( "#totalsaving" ).attr("style", "color:red");
			}
		    $( "#totalsaving" ).html( "<span id='tsaving' data-tsaving='"+saving+"'><h3>Total Saving: "+saving+"</h3>" );
		});
		$('.expense').blur(function () {
		    var totalexpense = 0;
		    $('.expense').each(function() {
		        if($(this).val()!="")
		         {
		            totalexpense += parseFloat($(this).val());
		         }

		    });
		    $( "#totalexpense" ).html( "<span id='texpense' data-texpense='"+totalexpense+"'><h3>Total Expense: "+totalexpense+"</h3>" );
		    var saving = parseFloat($("#tincome").data("tincome")) - totalexpense;
		    if(saving>0){
		    	$( "#totalsaving" ).attr("style", "color:green");
		    }else if(saving<0){
		    	$( "#totalsaving" ).attr("style", "color:red");
			}
		    $( "#totalsaving" ).html( "<span id='tsaving' data-tsaving='"+saving+"'><h3>Total Saving: "+saving+"</h3>" );
		});
	});

	//function to add all expense fields in daily updates view
	$(function () {
	  	
	});

}( jQuery ));