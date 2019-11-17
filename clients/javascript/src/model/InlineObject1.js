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

import ApiClient from '../ApiClient';

/**
 * The InlineObject1 model module.
 * @module model/InlineObject1
 * @version 1.0
 */
class InlineObject1 {
    /**
     * Constructs a new <code>InlineObject1</code>.
     * @alias module:model/InlineObject1
     */
    constructor() { 
        
        InlineObject1.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject1</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject1} obj Optional instance to populate.
     * @return {module:model/InlineObject1} The populated <code>InlineObject1</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject1();

            if (data.hasOwnProperty('RightTrackSpeed')) {
                obj['RightTrackSpeed'] = ApiClient.convertToType(data['RightTrackSpeed'], Object);
            }
            if (data.hasOwnProperty('LeftTrackSpeed')) {
                obj['LeftTrackSpeed'] = ApiClient.convertToType(data['LeftTrackSpeed'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} RightTrackSpeed
 */
InlineObject1.prototype['RightTrackSpeed'] = undefined;

/**
 * @member {Object} LeftTrackSpeed
 */
InlineObject1.prototype['LeftTrackSpeed'] = undefined;






export default InlineObject1;

