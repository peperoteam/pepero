$(function() {


    $("[data-confirm-delete]").click(function() {
        return confirm("삭제하시겠습니까?");
    })
});

$(function() {

    $("[data-confirm-update]").click(function() {
        return confirm("승인하시겠습니까?");
    })

});

$(function() {

    $("[data-url]").click(function() {
        var url = $(this).attr("data-url"); location.href = url;
    })

});