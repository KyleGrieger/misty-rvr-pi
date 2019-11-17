/**
 * Misty API
 * Misty Open API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.MistyApi);
  }
}(this, function(expect, MistyApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new MistyApi.ApiDeviceResult();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ApiDeviceResult', function() {
    it('should create an instance of ApiDeviceResult', function() {
      // uncomment below and update the code to test ApiDeviceResult
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be.a(MistyApi.ApiDeviceResult);
    });

    it('should have the property robotId (base name: "robotId")', function() {
      // uncomment below and update the code to test the property robotId
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property serialNumber (base name: "serialNumber")', function() {
      // uncomment below and update the code to test the property serialNumber
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property currentProfileName (base name: "currentProfileName")', function() {
      // uncomment below and update the code to test the property currentProfileName
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property hardwareInfo (base name: "hardwareInfo")', function() {
      // uncomment below and update the code to test the property hardwareInfo
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property ipAddress (base name: "ipAddress")', function() {
      // uncomment below and update the code to test the property ipAddress
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property batteryLevel (base name: "batteryLevel")', function() {
      // uncomment below and update the code to test the property batteryLevel
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property occipitalDeviceInfo (base name: "occipitalDeviceInfo")', function() {
      // uncomment below and update the code to test the property occipitalDeviceInfo
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property outputCapabilities (base name: "outputCapabilities")', function() {
      // uncomment below and update the code to test the property outputCapabilities
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property robotVersion (base name: "robotVersion")', function() {
      // uncomment below and update the code to test the property robotVersion
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property sensoryServiceAppVersion (base name: "sensoryServiceAppVersion")', function() {
      // uncomment below and update the code to test the property sensoryServiceAppVersion
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property windowsOSVersion (base name: "windowsOSVersion")', function() {
      // uncomment below and update the code to test the property windowsOSVersion
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

    it('should have the property sensorCapabilities (base name: "sensorCapabilities")', function() {
      // uncomment below and update the code to test the property sensorCapabilities
      //var instane = new MistyApi.ApiDeviceResult();
      //expect(instance).to.be();
    });

  });

}));
