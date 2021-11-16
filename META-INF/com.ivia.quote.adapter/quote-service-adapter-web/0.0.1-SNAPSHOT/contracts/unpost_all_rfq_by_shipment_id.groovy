import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType

Contract.make {
    description "Should unpost all RFQs by shipmentId"
    request {
        url "/rfq/shipment/358748/unpost"
        method PUT()
    }
    response {
        status 200
    }
}