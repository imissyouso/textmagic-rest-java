/*
 * TextMagic API Documentation
 * # Overview ## Introduction test <img style=\"float: right; margin-left: 10px; width: 100px;\" src=\"images/phone.png\"> TextMagic SMS API is a platform for building your own messaging app using our messaging infrastructure. It allows you to send and receive SMS text messages, query information about inbound and outbound messages, manage contacts, create templates (i.e. message formats and static texts) and schedule recurrent SMS messages as well as process bulk SMS messages. <button name=\"button\" onclick=\"http://www.google.com\" class=\"btn\">Try TextMagic API for Free</button>  ### Two Ways to Use TextMagic API * [REST API](https://www.textmagic.com/docs/api/start/) – get full access to TextMagic’s messaging gateway features * [Email to SMS API](https://www.textmagic.com/docs/api/send-email-to-sms/) – set up two-way SMS communication without the need to write any additional code  ### Code Libraries We have created a set of client libraries for the most popular programming languages (such as REST API Java and REST API PHP). These libraries allow you to integrate our API into your code in minutes. Just choose your preferred language to get started:  ## Getting started Get Started with the TextMagic REST API To start sending text messages using the TextMagic REST API, just follow these steps: 1. Generate the API credentials 1. Connect to our API endpoint This page provides all the information you need to get started. Here, we explain the following steps:  How to obtain the API credentials The API endpoint How the REST API works The next step How to obtain the API credentials  ### How to obtain the API credentials To start sending text messages, you need to create an API key. API keys are similar to an account password; the difference is that an API key only provides access to the API: you cannot log in to TextMagic Online using the API key.  Your program sends the login credentials with each API request as HTTP headers: `X-TM-Username` is your TextMagic username, while `X-TM-Key` is your API key.  How to obtain an API key:  1. Log in to TextMagic (or start a free trial if you haven’t registered yet). 1. Go to the API settings page. 1. Click the Add new API key button. 1. Enter an app name for this key. Note, it’s just a label, so pick any name. 1. Click Generate new key. 1. You should now see your new API key in the green notification banner above the table:  ![alt text](images/credentials.png)  > Note for API v1 users > V1 keys are not compatible with the V2 version of the TextMagic REST API, so you will need to generate a new API key to use the V2 endpoint.  ### The API endpoint The TextMagic REST API endpoint is: ``` https://rest.textmagic.com/api/v2 ``` All the URLs referenced in this documentation should use this base URL.  ### How the REST API works REST APIs use the HTTP protocol to send and receive messages. REST messages are usually encoded as JSON documents and are an improvement over older methods such as the XML based SOAP protocol. REST APIs use the same set of methods that web browsers use: POST, GET, PUT or DELETE. These correspond to the CRUD operations: create, read, update and delete. Often, REST URIs provide direct CRUD access to entities or collections of entities, for example: http://api.foo.com/people. In this instance, to delete a person’s endpoint, you might simply call the endpoint DELETE http://api.foo.com/people/{id}. REST makes these types of operations simple.  > Example > > Let’s take the entity most often used in messaging: contacts. Imagine you want to perform operations on your contacts list: well, it’s only a matter of calling the following endpoints: > * GET /api/v2/contacts (get all of your contacts) > * GET /api/v2/contacts/{id} (get a specific contact) > * POST /api/v2/contacts (create a new contact) > * PUT /api/v2/contacts/{id} (update an existing contact) > * DELETE /api/v2/contacts/{id} (delete an existing contact) It’s that simple! In fact, that’s all you need to do to manage the contacts in your TextMagic account!  ## Sandbox Sandbox is a tool to test TextMagic REST API requests without the need to install any applications or write any code. Here, we explain the following details about Sandbox: * The credentials area * Command documentation * How it works  <a href=\"\">Go to TextMagic Sandbox</a>  ### The credentials area To make requests using your TextMagic account, you need to enter your account username and your API key into the corresponding fields. You may also Save them in your browser or press Clear to erase them.  ![alt text](images/sandbox.png) 
 *
 * OpenAPI spec version: 2
 * Contact: support@textmagi.biz
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.textmagic.sdk.api;

import com.textmagic.sdk.ApiException;
import com.textmagic.sdk.model.BadRequestResponse;
import com.textmagic.sdk.model.CreateSurveyInputObject;
import com.textmagic.sdk.model.CreateSurveyNodeInputObject;
import com.textmagic.sdk.model.GetSurveyNodesResponse;
import com.textmagic.sdk.model.GetSurveysResponse;
import com.textmagic.sdk.model.MergeSurveyNodesInputObject;
import com.textmagic.sdk.model.NotFoundResponse;
import com.textmagic.sdk.model.ResourceLinkResponse;
import com.textmagic.sdk.model.Survey;
import com.textmagic.sdk.model.SurveyNode;
import com.textmagic.sdk.model.UnauthorizedResponse;
import com.textmagic.sdk.model.UpdateSurveyInputObject;
import com.textmagic.sdk.model.UpdateSurveyNodeInputObject;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SurveysApi
 */
@Ignore
public class SurveysApiTest {

    private final SurveysApi api = new SurveysApi();

    
    /**
     * Cancel a survey.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelSurveyTest() throws ApiException {
        Integer id = null;
        ResourceLinkResponse response = api.cancelSurvey(id);

        // TODO: test validations
    }
    
    /**
     * Create a new survey from the submitted data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSurveyTest() throws ApiException {
        CreateSurveyInputObject createSurveyInputObject = null;
        Boolean xIgnoreNullValues = null;
        ResourceLinkResponse response = api.createSurvey(createSurveyInputObject, xIgnoreNullValues);

        // TODO: test validations
    }
    
    /**
     * Create a new node from the submitted data.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSurveyNodeTest() throws ApiException {
        CreateSurveyNodeInputObject createSurveyNodeInputObject = null;
        Integer id = null;
        Boolean xIgnoreNullValues = null;
        ResourceLinkResponse response = api.createSurveyNode(createSurveyNodeInputObject, id, xIgnoreNullValues);

        // TODO: test validations
    }
    
    /**
     * Delete a survey.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSurveyTest() throws ApiException {
        Integer id = null;
        api.deleteSurvey(id);

        // TODO: test validations
    }
    
    /**
     * Delete a node.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSurveyNodeTest() throws ApiException {
        Integer id = null;
        api.deleteSurveyNode(id);

        // TODO: test validations
    }
    
    /**
     * Duplicate a survey.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void duplicateSurveyTest() throws ApiException {
        Integer id = null;
        ResourceLinkResponse response = api.duplicateSurvey(id);

        // TODO: test validations
    }
    
    /**
     * Get a survey by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSurveyTest() throws ApiException {
        Integer id = null;
        Survey response = api.getSurvey(id);

        // TODO: test validations
    }
    
    /**
     * Get a node by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSurveyNodeTest() throws ApiException {
        Integer id = null;
        SurveyNode response = api.getSurveyNode(id);

        // TODO: test validations
    }
    
    /**
     * Fetch nodes by given survey id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSurveyNodesTest() throws ApiException {
        Integer id = null;
        GetSurveyNodesResponse response = api.getSurveyNodes(id);

        // TODO: test validations
    }
    
    /**
     * Get all user surveys.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSurveysTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        GetSurveysResponse response = api.getSurveys(page, limit);

        // TODO: test validations
    }
    
    /**
     * Merge two question nodes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeSurveyNodesTest() throws ApiException {
        MergeSurveyNodesInputObject mergeSurveyNodesInputObject = null;
        Boolean xIgnoreNullValues = null;
        api.mergeSurveyNodes(mergeSurveyNodesInputObject, xIgnoreNullValues);

        // TODO: test validations
    }
    
    /**
     * Reset a survey flow.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetSurveyTest() throws ApiException {
        Integer id = null;
        ResourceLinkResponse response = api.resetSurvey(id);

        // TODO: test validations
    }
    
    /**
     * Start a survey.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startSurveyTest() throws ApiException {
        Integer id = null;
        ResourceLinkResponse response = api.startSurvey(id);

        // TODO: test validations
    }
    
    /**
     * Update existing survey.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSurveyTest() throws ApiException {
        UpdateSurveyInputObject updateSurveyInputObject = null;
        Integer id = null;
        Boolean xIgnoreNullValues = null;
        ResourceLinkResponse response = api.updateSurvey(updateSurveyInputObject, id, xIgnoreNullValues);

        // TODO: test validations
    }
    
    /**
     * Update existing node.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSurveyNodeTest() throws ApiException {
        UpdateSurveyNodeInputObject updateSurveyNodeInputObject = null;
        Integer id = null;
        Boolean xIgnoreNullValues = null;
        ResourceLinkResponse response = api.updateSurveyNode(updateSurveyNodeInputObject, id, xIgnoreNullValues);

        // TODO: test validations
    }
    
}
