$(document).ready(function() {
    $("#locales").change(function () {
        let selectedOption = $('#locales').val();
        if (selectedOption != ''){
            window.location.replace('main?lang=' + selectedOption);
        }
    });
});