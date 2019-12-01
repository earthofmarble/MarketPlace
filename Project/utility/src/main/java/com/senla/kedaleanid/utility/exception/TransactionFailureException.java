package com.senla.kedaleanid.utility.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by earthofmarble on Sep, 2019
 */

public class TransactionFailureException extends RuntimeException {

    private static Logger logger = LoggerFactory.getLogger(TransactionFailureException.class);

    public TransactionFailureException(String message) {
        super(message);
        logger.info(message);
    }
}
