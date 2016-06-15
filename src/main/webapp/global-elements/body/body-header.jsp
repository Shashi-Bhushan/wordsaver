<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- NAV BAR --%>
<nav class="navbar navbar-inverse navbar-static-top custom-navbar" role="navigation">
    <div class="container">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <div class="navbar-header">
            <a class="navbar-brand" rel="home" href="#" title="Help">
                Word Saver
            </a>
        </div>
        <!-- Non-collapsing right-side icons -->
        <ul class="nav navbar-nav navbar-right">
            <li>
                <!-- Trigger the modal with a button -->
                <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Create</button>
            </li>
        </ul>
        <!-- the collapsing menu -->
        <div class="collapse navbar-collapse navbar-left"  id="navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
    <!--/.container -->
</nav>

<%-- Body Forms Include--%>
<%@include file="forms/create-new-word.jsp"%>
