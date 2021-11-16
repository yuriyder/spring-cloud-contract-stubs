import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

Contract.make {
    description "Should get unit capacity"
    request {
        url "/carriers/100/units/capacity/get?searchRadius=150&types=SVN,RFR&dimensions.length=100&dimensions.width=200&dimensions.height=300&payload=3000&dockHight=false&liftGate=true&requirements=&pickup.lat=29.95106579999999&pickup.lng=-90.0715323&lastEventId=&r=1072823132973666"
        method GET()
    }
    response {
        status 200
    }
}