<#include "header.ftl">
<div class="row">
	<div class="col-xs-12">
    	<div class="box">
        	<div class="box-header">
            	<h3 class="box-title">Scheduler</h3>
                <div class="box-tools">
                	<div class="input-group">
                    	<input type="text" name="table_search" size="50" id="filter" class="form-control input-large" placeholder="Start typing what you are looking for...">
                    </div>
                </div>
			</div>
            <div class="box-body table-responsive no-padding">
            	<table class="table table-hover">
                	<thead>
						<tr>
							<th data-sort="string"><b>Key</b></th>
							<th data-sort="string"><b>Value</b></th>
						</tr>
					</thead>
					<tbody class="searchable">
						<#list jobs as job>
							<tr>
								<td>${job.name}</td>
								<td>${job.active?string('yes', 'no')}</td>
								<td>${job.description}</td>
								<td><#if job.previousFireTime??>${job.previousFireTime?string('dd.MM.yyyy HH:mm:ss')}<#else>-</#if></td>
								<td><#if job.nextFireTime??>${job.nextFireTime?string('dd.MM.yyyy HH:mm:ss')}<#else>-</#if></td>
							</tr>
						</#list>
                	</tbody>
                </table>
        	</div>
    	</div>
	</div>
</div>
<#include "footer.ftl">