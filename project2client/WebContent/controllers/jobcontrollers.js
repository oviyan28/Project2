/**
 * 
 */
app.controller('JobCtrl',function($scope,JobService){//JobService is an Service object with one function addJob()
	
	$scope.addJob=function(){
		JobService.addJob($scope.job).then(
		function(response){ 
			alert('Job details inserted successfully...')
			$scope.job={}
		},function(response){ 
			console.log(response.status)
			if(response.status==400)
				$scope.message="CLIENT ERROR... BAD REQUEST"
				else
			$scope.error=response.data})
	}
	
	JobService.getAllJobs().then(
			function(response){
				$scope.jobs=response.data
			},function(response){
				
			})
})


