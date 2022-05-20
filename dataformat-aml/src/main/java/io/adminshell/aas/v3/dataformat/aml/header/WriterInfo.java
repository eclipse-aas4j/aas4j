/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.dataformat.aml.header;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Utility class to represent the WriterInfo section in an AML document
 */
public class WriterInfo {

    @XmlElement(name = "WriterName")
    private String name;
    @XmlElement(name = "WriterID")
    private String id;
    @XmlElement(name = "WriterVendor")
    private String vendor;
    @XmlElement(name = "WriterVendorURL")
    private String vendorUrl;
    @XmlElement(name = "WriterVersion")
    private String version;
    @XmlElement(name = "WriterRelease")
    private String release;
    @XmlElement(name = "LastWritingDateTime")
    private String writingDate;
    @XmlElement(name = "WriterProjectTitle")
    private String projectTitle;
    @XmlElement(name = "WriterProjectID")
    private String projectID;

    public WriterInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        writingDate = formatter.format(new Date());
    }

    public String getName() {
        return name;
    }

    @XmlType(name = "xs:anyType")
    public static class Wrapper {

        @XmlElement(name = "WriterHeader")
        private WriterInfo writerHeader;

        public Wrapper() {
        }

        public WriterInfo getWriterHeader() {
            return writerHeader;
        }

        public void setWriterHeader(WriterInfo writerHeader) {
            this.writerHeader = writerHeader;
        }
    }

    public Object wrap() {
        Wrapper result = new Wrapper();
        result.setWriterHeader(this);
        return result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendorUrl() {
        return vendorUrl;
    }

    public void setVendorUrl(String vendorUrl) {
        this.vendorUrl = vendorUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getWritingDate() {
        return writingDate;
    }

    public void setWritingDate(String writingDate) {
        this.writingDate = writingDate;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

}
