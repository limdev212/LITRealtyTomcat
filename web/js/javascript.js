function myMap() {
    var map = new google.maps.Map(document.getElementById('googleMap'), {
        zoom: 15,
        center: {lat: -34.397, lng: 150.644}
    });
    var geocoder = new google.maps.Geocoder();

    geocodeAddress(geocoder, map);
}

function geocodeAddress(geocoder, resultsMap) {
    var address = document.getElementsByTagName('H3')[0].getAttribute('value');
    geocoder.geocode({'address': address}, function (results, status) {
        if (status === 'OK') {
            resultsMap.setCenter(results[0].geometry.location);
            var marker = new google.maps.Marker({
                map: resultsMap,
                position: results[0].geometry.location
            });
        } else {
            alert('Geocode was not successful for the following reason: ' + status + ' add: ' + address);
        }
    });
}

