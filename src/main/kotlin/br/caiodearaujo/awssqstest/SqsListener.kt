package br.caiodearaujo.awssqstest

import org.apache.juli.logging.LogFactory
import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Service

@Service
class SqsListener {

    internal val logger = LogFactory.getLog(this::class.java)

    @JmsListener(destination = "TestSQS_001")
    fun listenerSqs(request: String) {
        this.logger.info("Received: $request")
    }

}
