<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="icon" type="image/jpg" href="/img/icon.jpg" sizes="64x46">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
          crossorigin="anonymous">
    <link rel="stylesheet" href="/css/bootstrap.css" >
    <link rel="stylesheet" href="/css/dataTables.bootstrap.min.css">
    <title>Coronavirus Tracker</title>
</head>

<body>

<nav class="navbar navbar-expand-sm navbar-dark navbar-fixed-top bg-dark p-2">
    <div class="container-fluid ml-4">
        <a href="/" class="navbar-brand">Coronavirus Tracker App</a>
        <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item px-2">
                    <a href="/" class="nav-link <#if active="all">active </#if>">Home</a>
                </li>
                <li class="nav-item px-2">
                    <a href="/confirmed" class="nav-link <#if active="confirmed">active </#if>">Confirmed</a>
                </li>
                <li class="nav-item px-2">
                    <a href="/recovered" class="nav-link <#if active="recovered">active </#if>">Recovered</a>
                </li>
                <li class="nav-item px-2">
                    <a href="/deaths" class="nav-link <#if active="deaths">active </#if>">Deaths</a>
                </li>
<#--                <li class="nav-item">-->
<#--                    <a href="login.html" class="nav-link">-->
<#--                        <i class="fas fa-user-times"></i> user-->
<#--                    </a>-->
<#--                </li>-->
            </ul>
        </div>
    </div>
</nav>
<br>
<#--<!-- HEADER &ndash;&gt;-->
<#--<header id="main-header" class="py-2 bg-primary text-white">-->
<#--    <div class="container">-->
<#--        <div class="row">-->
<#--            <div class="col-md-12">-->
<#--                <h6>-->
<#--                    <marquee> <i class="fas fa-cog"></i> Coronavirus COVID-19 Global Cases by Johns Hopkins CSSE </marquee>-->
<#--                </h6>-->
<#--            </div>-->
<#--        </div>-->
<#--    </div>-->
<#--</header>-->
