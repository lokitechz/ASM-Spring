$(document).ready(function () {
    $('#list_product').DataTable({
        pageLength: 5,
        "lengthMenu": [[5, 10, 15], [5, 10, 15]],
        "language": {
            "lengthMenu": "Hiển thị _MENU_ sản phẩm mỗi trang",
            "zeroRecords": "Không có món ăn nào",
            "info": "Hiển thị trang _PAGE_ trong số _PAGES_ trang",
            "infoEmpty": "Không tìm thấy sản phẩm",
            "infoFiltered": "(Lọc từ _MAX_ sản phẩm)",
            "paginate": {
                "previous": "Trước",
                "next": "Sau"
            },
            "search": "Tìm kiếm:"
        }
    });
});