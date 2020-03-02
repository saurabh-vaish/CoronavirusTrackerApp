<!-- FOOTER -->
<footer id="main-footer" class="bg-dark text-white mt-5 p-2">
    <div class="container">
        <div class="row">
            <div class="col">
                <p class="lead text-center">
                    Made with <span class="heart text-danger">❤</span> by SRV
                </p>
            </div>
        </div>
    </div>
</footer>



<script src="/js/jquery.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="/js/bootstrap.min.js"></script>
<script src="/js/jquery-datatables-min.js"></script>
<script src="/js/dataTables.bootstrap.min.js"></script>

<script>
    $(document).ready(function() {
        $('#coronatable').DataTable().columns.adjust();
    } );
</script>
</body>

</html>