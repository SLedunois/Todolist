import { ng, template } from 'entcore';

/**
	Wrapper controller
	------------------
	Main controller.
**/
export const mainController = ng.controller('MainController', ['$scope', 'route', ($scope, route) => {
    route({
        list: () => {
            /**
             * Ouvre le template main.html situé dans src/main/resources/public/template dans le container main.
             * Ce container est symbolisé par la balise <container template="main"></container> de la vue principale
             */
            template.open('main', 'list');
        }
    })
}]);
