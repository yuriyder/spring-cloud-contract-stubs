import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

Contract.make {
    description "Should get active posted RFQ by shipmentId"
    request {
        url "/rfq/shipment/123456"
        method GET()
    }
    response {
        status 200
        headers {
            header (HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        }
        body (
                List.of(565656,787878)
        )
    }
}