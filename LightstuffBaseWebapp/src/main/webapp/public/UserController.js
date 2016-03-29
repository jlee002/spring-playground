function getUserController($scope, $http) {
    $http.get('http://localhost:8080/LightstuffBase/rest/user/1').
        then(function(value) {
            $scope.user = value.data;
        });
}