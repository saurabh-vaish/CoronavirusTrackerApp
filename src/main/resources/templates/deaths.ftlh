<#include "header.ftlh" />
<br>
<!-- POSTS -->
<section id="posts">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="table-responsive">
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
                        <#list corona.getLocations() as data>
                        <tr>
                            <td>${data?index+1}</td>
                            <td>${data.getCountry()}</td>
                            <td>${data.getProvince()}</td>
                            <td>${data.getLatest()}</td>
                            <td>
                                ${data.getCoordinates().getLatitude()}, ${data.getCoordinates().getLongitude()}</a>
                            </td>
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