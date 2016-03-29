function getUser($scope, $http) {
    $http.get('http://localhost:8080/LightstuffBase/rest/user/1').
        success(function(data) {
            $scope.user = data;
        });
}