import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

Contract.make {
    description "Should count active posted RFQs by each shipmentId"
    request {
        url "/rfq/shipment/count"
        method POST()
        headers {
            header (HttpHeaders.CONTENT_TYPE, "application/json;charset=UTF-8")
        }
        body (
                List.of(394284, 434563)
        )
    }
    response {
        status 200
        headers {
            header (HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        }
        body (
                Map.of(394284L, 5L, 434563L, 1L)
        )
    }
}