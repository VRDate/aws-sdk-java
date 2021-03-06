/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes whether S3 data event logs will be automatically enabled for new members of the organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/OrganizationS3LogsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationS3LogsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that contains information on whether S3 data event logs will be enabled automatically as a data source
     * for the organization.
     * </p>
     */
    private Boolean autoEnable;

    /**
     * <p>
     * A value that contains information on whether S3 data event logs will be enabled automatically as a data source
     * for the organization.
     * </p>
     * 
     * @param autoEnable
     *        A value that contains information on whether S3 data event logs will be enabled automatically as a data
     *        source for the organization.
     */

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * A value that contains information on whether S3 data event logs will be enabled automatically as a data source
     * for the organization.
     * </p>
     * 
     * @return A value that contains information on whether S3 data event logs will be enabled automatically as a data
     *         source for the organization.
     */

    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * A value that contains information on whether S3 data event logs will be enabled automatically as a data source
     * for the organization.
     * </p>
     * 
     * @param autoEnable
     *        A value that contains information on whether S3 data event logs will be enabled automatically as a data
     *        source for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationS3LogsConfiguration withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * A value that contains information on whether S3 data event logs will be enabled automatically as a data source
     * for the organization.
     * </p>
     * 
     * @return A value that contains information on whether S3 data event logs will be enabled automatically as a data
     *         source for the organization.
     */

    public Boolean isAutoEnable() {
        return this.autoEnable;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationS3LogsConfiguration == false)
            return false;
        OrganizationS3LogsConfiguration other = (OrganizationS3LogsConfiguration) obj;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationS3LogsConfiguration clone() {
        try {
            return (OrganizationS3LogsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.OrganizationS3LogsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
