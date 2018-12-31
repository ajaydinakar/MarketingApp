var app=angular.module('pt',['ngRoute']);

app.config(['$routeProvider',function($routeProvider)
		
		
		{
	    $routeProvider.when("/rcs", {template:'home.html',controller:'position'})
	                  .otherwise({redirectTo: '/posits'});
	
	
	
	
		}]);






app.controller('ct', ['$scope', function($scope){
	$scope.name="ajay";
	$scope.clickme=function (){
      $scope.posit="ajay how arre you";
	}
}]);

app.controller('position', ['$scope','$http', function($scope,$http){

	$http.get("http://127.0.0.1:9096/posits")
	.then(function(response)
          {
           $scope.json=response.data._embedded.posits;
           $scope.status=response.status;
          }
         ,function(response)
          {
           $scope.json={"name":"ajay"}
           $scope.status=response.status;
          }

	      )
	

	
}]);






