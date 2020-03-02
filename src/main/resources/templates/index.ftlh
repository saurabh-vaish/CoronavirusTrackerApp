<#include "header.ftlh" />
<br>
<!-- POSTS -->
<section id="posts">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-3">
                <div class="card text-center bg-primary text-white mb-3">
                    <div class="card-body">
                        <h3>Total Confirmed</h3>
                        <h4 >
                            <i class="fas fa-bug">&nbsp; ${corona.getLatest().getConfirmed()}</i>
                        </h4>
                        <a href="/confirmed" class="btn btn-outline-light btn-block">View</a>
                    </div>
                </div>

                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Total Recovered</h3>
                        <h4 >
                            <i class="fas fa-smile">&nbsp; ${corona.getLatest().getRecovered()}</i>
                        </h4>
                        <a href="/recovered" class="btn btn-outline-light btn-block">View </a>
                    </div>
                </div>

                <div class="card text-center bg-warning text-white mb-3">
                    <div class="card-body">
                        <h3>Total Deaths</h3>
                        <h4 >
                            <i class="fas fa-frown">&nbsp; ${corona.getLatest().getDeaths()}</i>
                        </h4>
                        <a href="/deaths" class="btn btn-outline-light btn-block">View</a>
                    </div>
                </div>
            </div>
            <div class="col-md-9">
                <div class=" table-responsive">
                    <table id = "coronatable" class="table text-center table-striped table-hover">
                        <thead class="thead-dark">
                        <tr>
                            <th>S.No.</th>
                            <th>Country</th>
                            <th>State</th>
                            <th>Latest</th>
                            <th>Coordinates</th>
                            <th>View History</th>
                        </tr>
                        </thead>
                        <tbody>
                        <#list corona.getConfirmed().getLocations() as data>
                        <tr>
                            <td>${data?index}</td>
                            <td>${data.getCountry()}</td>
                            <td>${data.getProvince()}</td>
                            <td>${data.getLatest()}</td>
                            <td>${data.getCoordinates().getLatitude()}, ${data.getCoordinates().getLongitude()}</td>
                            <td>
                                <#if data.getProvince()!="">
                                    <a href="/history/state/${data.getProvince()}" class="btn btn-secondary">
                                        <i class="fas fa-eye"></i> View
                                    </a>
                                <#else>
                                    <a href="/history/country/${data.getCountry()}" class="btn btn-secondary">
                                        <i class="fas fa-eye"></i> View
                                    </a>
                                </#if>
                            </td>
                        </tr>
                        </#list>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>




<#include "footer.ftlh" />