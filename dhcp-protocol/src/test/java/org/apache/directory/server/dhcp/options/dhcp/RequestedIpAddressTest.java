package org.apache.directory.server.dhcp.options.dhcp;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.directory.server.dhcp.DhcpException;

/**
 *
 * @author cfscosta
 */
public class RequestedIpAddressTest {

    @Test
    public void testValidateFailure() {
        boolean caughtException = false;
        RequestedIpAddress addressOption = new RequestedIpAddress();
        addressOption.setData(new byte[]{1,2,3,4,5});
        try {
            addressOption.validate();
        } catch (DhcpException e) {
            caughtException = true;
        }
        assert(caughtException);
    }
}