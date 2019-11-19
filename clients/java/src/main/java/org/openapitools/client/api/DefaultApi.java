/*
 * Misty API
 * Misty Open API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.InlineObject;
import org.openapitools.client.model.InlineObject1;
import org.openapitools.client.model.InlineObject2;
import org.openapitools.client.model.InlineObject3;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.InlineResponse2001;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for drive
     * @param linearVelocity  (optional, default to null)
     * @param angularVelocity  (optional, default to null)
     * @param inlineObject  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call driveCall(Object linearVelocity, Object angularVelocity, InlineObject inlineObject, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject;

        // create path and map variables
        String localVarPath = "/api/drive";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (linearVelocity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("LinearVelocity", linearVelocity));
        }

        if (angularVelocity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("AngularVelocity", angularVelocity));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call driveValidateBeforeCall(Object linearVelocity, Object angularVelocity, InlineObject inlineObject, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = driveCall(linearVelocity, angularVelocity, inlineObject, _callback);
        return localVarCall;

    }

    /**
     * Drive
     * Drive
     * @param linearVelocity  (optional, default to null)
     * @param angularVelocity  (optional, default to null)
     * @param inlineObject  (optional)
     * @return List&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<InlineResponse200> drive(Object linearVelocity, Object angularVelocity, InlineObject inlineObject) throws ApiException {
        ApiResponse<List<InlineResponse200>> localVarResp = driveWithHttpInfo(linearVelocity, angularVelocity, inlineObject);
        return localVarResp.getData();
    }

    /**
     * Drive
     * Drive
     * @param linearVelocity  (optional, default to null)
     * @param angularVelocity  (optional, default to null)
     * @param inlineObject  (optional)
     * @return ApiResponse&lt;List&lt;InlineResponse200&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InlineResponse200>> driveWithHttpInfo(Object linearVelocity, Object angularVelocity, InlineObject inlineObject) throws ApiException {
        okhttp3.Call localVarCall = driveValidateBeforeCall(linearVelocity, angularVelocity, inlineObject, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Drive (asynchronously)
     * Drive
     * @param linearVelocity  (optional, default to null)
     * @param angularVelocity  (optional, default to null)
     * @param inlineObject  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call driveAsync(Object linearVelocity, Object angularVelocity, InlineObject inlineObject, final ApiCallback<List<InlineResponse200>> _callback) throws ApiException {

        okhttp3.Call localVarCall = driveValidateBeforeCall(linearVelocity, angularVelocity, inlineObject, _callback);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for driveHeading
     * @param heading  (optional, default to null)
     * @param distance  (optional, default to null)
     * @param timeMS  (optional, default to null)
     * @param inlineObject2  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call driveHeadingCall(Object heading, Object distance, Object timeMS, InlineObject2 inlineObject2, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject2;

        // create path and map variables
        String localVarPath = "/api/drive/hdt";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (heading != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Heading", heading));
        }

        if (distance != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Distance", distance));
        }

        if (timeMS != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("TimeMS", timeMS));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call driveHeadingValidateBeforeCall(Object heading, Object distance, Object timeMS, InlineObject2 inlineObject2, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = driveHeadingCall(heading, distance, timeMS, inlineObject2, _callback);
        return localVarCall;

    }

    /**
     * Drive Heading
     * Drive Heading
     * @param heading  (optional, default to null)
     * @param distance  (optional, default to null)
     * @param timeMS  (optional, default to null)
     * @param inlineObject2  (optional)
     * @return List&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<InlineResponse2001> driveHeading(Object heading, Object distance, Object timeMS, InlineObject2 inlineObject2) throws ApiException {
        ApiResponse<List<InlineResponse2001>> localVarResp = driveHeadingWithHttpInfo(heading, distance, timeMS, inlineObject2);
        return localVarResp.getData();
    }

    /**
     * Drive Heading
     * Drive Heading
     * @param heading  (optional, default to null)
     * @param distance  (optional, default to null)
     * @param timeMS  (optional, default to null)
     * @param inlineObject2  (optional)
     * @return ApiResponse&lt;List&lt;InlineResponse2001&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InlineResponse2001>> driveHeadingWithHttpInfo(Object heading, Object distance, Object timeMS, InlineObject2 inlineObject2) throws ApiException {
        okhttp3.Call localVarCall = driveHeadingValidateBeforeCall(heading, distance, timeMS, inlineObject2, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse2001>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Drive Heading (asynchronously)
     * Drive Heading
     * @param heading  (optional, default to null)
     * @param distance  (optional, default to null)
     * @param timeMS  (optional, default to null)
     * @param inlineObject2  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call driveHeadingAsync(Object heading, Object distance, Object timeMS, InlineObject2 inlineObject2, final ApiCallback<List<InlineResponse2001>> _callback) throws ApiException {

        okhttp3.Call localVarCall = driveHeadingValidateBeforeCall(heading, distance, timeMS, inlineObject2, _callback);
        Type localVarReturnType = new TypeToken<List<InlineResponse2001>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for driveTime
     * @param linearVelocity  (optional, default to null)
     * @param angularVelocity  (optional, default to null)
     * @param timeMS  (optional, default to null)
     * @param inlineObject3  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call driveTimeCall(Object linearVelocity, Object angularVelocity, Object timeMS, InlineObject3 inlineObject3, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject3;

        // create path and map variables
        String localVarPath = "/api/drive/time";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (linearVelocity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("LinearVelocity", linearVelocity));
        }

        if (angularVelocity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("AngularVelocity", angularVelocity));
        }

        if (timeMS != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("TimeMS", timeMS));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call driveTimeValidateBeforeCall(Object linearVelocity, Object angularVelocity, Object timeMS, InlineObject3 inlineObject3, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = driveTimeCall(linearVelocity, angularVelocity, timeMS, inlineObject3, _callback);
        return localVarCall;

    }

    /**
     * Drive Time
     * Drive Time
     * @param linearVelocity  (optional, default to null)
     * @param angularVelocity  (optional, default to null)
     * @param timeMS  (optional, default to null)
     * @param inlineObject3  (optional)
     * @return List&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<InlineResponse200> driveTime(Object linearVelocity, Object angularVelocity, Object timeMS, InlineObject3 inlineObject3) throws ApiException {
        ApiResponse<List<InlineResponse200>> localVarResp = driveTimeWithHttpInfo(linearVelocity, angularVelocity, timeMS, inlineObject3);
        return localVarResp.getData();
    }

    /**
     * Drive Time
     * Drive Time
     * @param linearVelocity  (optional, default to null)
     * @param angularVelocity  (optional, default to null)
     * @param timeMS  (optional, default to null)
     * @param inlineObject3  (optional)
     * @return ApiResponse&lt;List&lt;InlineResponse200&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InlineResponse200>> driveTimeWithHttpInfo(Object linearVelocity, Object angularVelocity, Object timeMS, InlineObject3 inlineObject3) throws ApiException {
        okhttp3.Call localVarCall = driveTimeValidateBeforeCall(linearVelocity, angularVelocity, timeMS, inlineObject3, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Drive Time (asynchronously)
     * Drive Time
     * @param linearVelocity  (optional, default to null)
     * @param angularVelocity  (optional, default to null)
     * @param timeMS  (optional, default to null)
     * @param inlineObject3  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call driveTimeAsync(Object linearVelocity, Object angularVelocity, Object timeMS, InlineObject3 inlineObject3, final ApiCallback<List<InlineResponse200>> _callback) throws ApiException {

        okhttp3.Call localVarCall = driveTimeValidateBeforeCall(linearVelocity, angularVelocity, timeMS, inlineObject3, _callback);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for driveTrack
     * @param rightTrackSpeed  (optional, default to null)
     * @param leftTrackSpeed  (optional, default to null)
     * @param inlineObject1  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call driveTrackCall(Object rightTrackSpeed, Object leftTrackSpeed, InlineObject1 inlineObject1, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = inlineObject1;

        // create path and map variables
        String localVarPath = "/api/drive/track";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (rightTrackSpeed != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("RightTrackSpeed", rightTrackSpeed));
        }

        if (leftTrackSpeed != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("LeftTrackSpeed", leftTrackSpeed));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call driveTrackValidateBeforeCall(Object rightTrackSpeed, Object leftTrackSpeed, InlineObject1 inlineObject1, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = driveTrackCall(rightTrackSpeed, leftTrackSpeed, inlineObject1, _callback);
        return localVarCall;

    }

    /**
     * Drive Track
     * Drive Track
     * @param rightTrackSpeed  (optional, default to null)
     * @param leftTrackSpeed  (optional, default to null)
     * @param inlineObject1  (optional)
     * @return List&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<InlineResponse200> driveTrack(Object rightTrackSpeed, Object leftTrackSpeed, InlineObject1 inlineObject1) throws ApiException {
        ApiResponse<List<InlineResponse200>> localVarResp = driveTrackWithHttpInfo(rightTrackSpeed, leftTrackSpeed, inlineObject1);
        return localVarResp.getData();
    }

    /**
     * Drive Track
     * Drive Track
     * @param rightTrackSpeed  (optional, default to null)
     * @param leftTrackSpeed  (optional, default to null)
     * @param inlineObject1  (optional)
     * @return ApiResponse&lt;List&lt;InlineResponse200&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InlineResponse200>> driveTrackWithHttpInfo(Object rightTrackSpeed, Object leftTrackSpeed, InlineObject1 inlineObject1) throws ApiException {
        okhttp3.Call localVarCall = driveTrackValidateBeforeCall(rightTrackSpeed, leftTrackSpeed, inlineObject1, null);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Drive Track (asynchronously)
     * Drive Track
     * @param rightTrackSpeed  (optional, default to null)
     * @param leftTrackSpeed  (optional, default to null)
     * @param inlineObject1  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call driveTrackAsync(Object rightTrackSpeed, Object leftTrackSpeed, InlineObject1 inlineObject1, final ApiCallback<List<InlineResponse200>> _callback) throws ApiException {

        okhttp3.Call localVarCall = driveTrackValidateBeforeCall(rightTrackSpeed, leftTrackSpeed, inlineObject1, _callback);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDeviceInformation
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDeviceInformationCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/device";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDeviceInformationValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getDeviceInformationCall(_callback);
        return localVarCall;

    }

    /**
     * Get Device Information
     * Get Device Information
     * @return List&lt;InlineResponse2001&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<InlineResponse2001> getDeviceInformation() throws ApiException {
        ApiResponse<List<InlineResponse2001>> localVarResp = getDeviceInformationWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Device Information
     * Get Device Information
     * @return ApiResponse&lt;List&lt;InlineResponse2001&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InlineResponse2001>> getDeviceInformationWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getDeviceInformationValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<InlineResponse2001>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Device Information (asynchronously)
     * Get Device Information
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDeviceInformationAsync(final ApiCallback<List<InlineResponse2001>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDeviceInformationValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<InlineResponse2001>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for stop
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call stopCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/drive/stop";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call stopValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = stopCall(_callback);
        return localVarCall;

    }

    /**
     * Stop
     * Stop
     * @return List&lt;InlineResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<InlineResponse200> stop() throws ApiException {
        ApiResponse<List<InlineResponse200>> localVarResp = stopWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Stop
     * Stop
     * @return ApiResponse&lt;List&lt;InlineResponse200&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<InlineResponse200>> stopWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = stopValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Stop (asynchronously)
     * Stop
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call stopAsync(final ApiCallback<List<InlineResponse200>> _callback) throws ApiException {

        okhttp3.Call localVarCall = stopValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<InlineResponse200>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}