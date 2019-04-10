/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package m39.m81.m213.m129;

import m39.m81.m213.m129.controllers.*;
import m39.m81.m213.m129.http.client.HttpClient;

public class APIMATICCalculatorClient {
    /**
     * Singleton access to Pass2019MallorcaCalculator controller
     * @return	Returns the Pass2019MallorcaCalculatorController instance 
     */
    public Pass2019MallorcaCalculatorController getPass2019MallorcaCalculator() {
        return Pass2019MallorcaCalculatorController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public APIMATICCalculatorClient() {
    }

}