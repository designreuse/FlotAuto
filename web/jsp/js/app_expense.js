
//Expense.jsp conditional input showing
function showInput(){
	var cbox = document.getElementById("expenseType");
	var str = cbox.options[cbox.selectedIndex].value;
	$("#component").addClass('hide');
	$("#labor").addClass('hide');
	$("#other").addClass('hide');
	$("#" + str.toLowerCase()).removeClass('hide');
};

//Update cost in Expense.jsp
function updateCost(field, elemId){
	//get current element id, then get the corresponding cost value (hidden)
	var id = $("#" + elemId).val();
	var cost = $("#" + field +"_" + id).val();
	$("#cost").val(cost);
	$("#quantity").trigger("onchange");
};

//Update total cost in Expense.jsp
function updateTotalCost(elemId){
	var cost = $("#cost").val();
	var qtty = $("#quantity").val();
	$("#totalCost").val(cost * qtty);
};

//Trigger change events
$.subscribe('triggerChange', function(event, data) {
	$("#expenseType").trigger("onchange");
	$("#quantity").trigger("onchange");
});