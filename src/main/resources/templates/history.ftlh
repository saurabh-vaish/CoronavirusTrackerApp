<#include "header.ftlh" />
<br>
<!-- POSTS -->
<section id="posts">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="card">
                    <#if !corona?has_content>
                        <h4>Sorry , No information available</h4>
                    <#elseif corona?has_content && mono?has_content>
                        <div class="card-body">
                            <table class="table text-center">
                                <tbody>
                                <tr class="row">
                                    <th class="col-6">Country</th><td class="col-6">${corona.getCountry()}</td>
                                </tr>
                                <tr class="row">
                                    <th class="col-6">State</th><td class="col-6">${corona.getProvince()}</td>
                                </tr>
                                <tr class="row">
                                    <th class="col-6">Total Infected</th><td class="col-6">${corona.getLatest()}</td>
                                </tr>
                                </tbody>
                            </table>
                            <hr>
                            <div class="table-responsive">
                                <table id = "coronatable" class="table table-striped table-hover text-center">
                                    <thead class="thead-dark">
                                    <tr>
                                        <th>S.No.</th>
                                        <th>Date</th>
                                        <th>Total Infected</th>
                                    </tr>
                                    </thead>
                                    <tbody >
                                    <#list corona.getHistory()?keys as key>
                                        <tr>
                                            <td>${key?index+1}</td>
                                            <td>${key}</td>
                                            <td>${corona.getHistory()[key]}</td>
                                        </tr>
                                    </#list>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    <#else>
                        <h4>Sorry , No information available</h4>
                    </#if>
                </div>

            </div>
        </div>
    </div>
</section>

<#include "footer.ftlh" />