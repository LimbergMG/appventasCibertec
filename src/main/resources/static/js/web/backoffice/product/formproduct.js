$(document).on("click","#btnagregar", function(){
    $("#txtnomproduct").val("");
    $("#txtunitpriceproduct").val("");
    $("#hddprodcod").val("0");
    $("#modalproduct").modal("show");
})

$(document).on("click",".btnactualizar",function(){
    $("#txtnomproduct").val($(this).attr("data-prodname"));
    $("#txtunitpriceproduct").val($(this).attr("data-produnit"));
    $("#hddprodcod").val($(this).attr("data-procod"));
    $("#modalproduct").modal("show");
})