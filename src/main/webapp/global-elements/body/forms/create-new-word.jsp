<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Enter a New Word</h4>
            </div>
            <div class="modal-body">
                <%-- Form to Enter Word--%>
                <form role="form">
                    <div class="form-group">
                        <label for="word">Word</label>
                        <input type="text" class="form-control" id="word">
                    </div>
                    <div class="form-group">
                        <label for="meaning">Meaning</label>
                        <input type="text" class="form-control" id="meaning">
                    </div>
                    <div class="form-group">
                        <label for="example">Example</label>
                        <input type="text" class="form-control" id="example">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Create</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
