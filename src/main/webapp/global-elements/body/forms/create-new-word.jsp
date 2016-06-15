<%@ page import="com.wordsaver.util.UUIDGenerator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="uuid" value="<%=UUIDGenerator.generateUUID()%>"/>

<!-- Modal -->
<div class="modal fade in" id="createWord" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Enter a New Word</h4>
            </div>
            <div class="modal-body">
                <%-- Form to Enter Word--%>
                <%-- Name along with Id because this way, it'll allow request.getParameter("word") to be value of field--%>
                <form role="form" id="${uuid}">
                    <div class="form-group">
                        <label for="word">Word</label>
                        <input type="text" class="form-control" id="word" name="word" placeholder="Enter A Word" value="obnoxious">
                    </div>
                    <div class="form-group">
                        <label for="meaning">Meaning</label>
                        <input type="text" class="form-control" id="meaning" name="meaning" placeholder="Meaning of the Word" value="bla bla">
                    </div>
                    <div class="form-group">
                        <label for="example">Example</label>
                        <input type="text" class="form-control" id="example" name="example" placeholder="Any example(Optional)">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="submit btn btn-primary" data-dismiss="modal">Create</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function(){
        $('#${uuid}').createWord({
            pageContext : "${pageContext.request.contextPath}",
            formId: "${uuid}"
        });
    });
</script>