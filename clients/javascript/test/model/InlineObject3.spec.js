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
    instance = new MistyApi.InlineObject3();
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

  describe('InlineObject3', function() {
    it('should create an instance of InlineObject3', function() {
      // uncomment below and update the code to test InlineObject3
      //var instane = new MistyApi.InlineObject3();
      //expect(instance).to.be.a(MistyApi.InlineObject3);
    });

    it('should have the property linearVelocity (base name: "LinearVelocity")', function() {
      // uncomment below and update the code to test the property linearVelocity
      //var instane = new MistyApi.InlineObject3();
      //expect(instance).to.be();
    });

    it('should have the property angularVelocity (base name: "AngularVelocity")', function() {
      // uncomment below and update the code to test the property angularVelocity
      //var instane = new MistyApi.InlineObject3();
      //expect(instance).to.be();
    });

    it('should have the property timeMS (base name: "TimeMS")', function() {
      // uncomment below and update the code to test the property timeMS
      //var instane = new MistyApi.InlineObject3();
      //expect(instance).to.be();
    });

  });

}));
