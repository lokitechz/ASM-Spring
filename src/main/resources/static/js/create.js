$(document).ready(function () {
    $('#btn_add').click(function () {
        let name = $('#name').val();
        let price = $('#price').val();

        if (!name && price <= 0) {
            $('#name_error_message').text('Tên món ăn không được bỏ trống');
            $('#name').keyup(function () {
                $('#name_error_message').text('');
            });
            $('#price_error_message').text('Giá phải lớn hơn 0')
            $('#price').keyup(function () {
                $('#price_error_message').text('');
            });
        } else if (price <= 0) {
            $('#price_error_message').text('Giá phải lớn hơn 0')
            $('#price').keyup(function () {
                $('#price_error_message').text('');
            });
        } else if (!name) {
            $('#name_error_message').text('Tên món ăn không được bỏ trống');
            $('#name').keyup(function () {
                $('#name_error_message').text('');
            });
        } else if (name.length <= 7) {
            $('#name_error_message').text('Tên món ăn phải dài hơn 7 kí tự');
            $('#name').keyup(function () {
                $('#name_error_message').text('');
            });
        } else {
            $('#form_add').submit();
        }
    });
});