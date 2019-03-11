<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>AOS_AM</className>
    <objects>
        <object type="Link" technology="Web">
            <name>SPEAKERS</name>
            <codeName>aSPEAKERSLink</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="false">SPEAKERS</property>
                    <property name="TagName" type="string" isRegExp="false">SPAN</property>
                </properties>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>REMOVE</name>
            <codeName>aREMOVEWebElement</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="AccessibilityName" type="string" isRegExp="false"></property>
                    <property name="ClassName" type="string" isRegExp="false">remove red ng-scope</property>
                    <property name="InnerText" type="string" isRegExp="false">REMOVE</property>
                    <property name="TagName" type="string" isRegExp="false">A</property>
                </properties>
                <index>0</index>
            </identification>
        </object>
        <object type="Link" technology="Web">
            <name>CONTINUE SHOPPING</name>
            <codeName>aCONTINUESHOPPINGLink</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="InnerText" type="string" isRegExp="false">CONTINUE SHOPPING</property>
                    <property name="TagName" type="string" isRegExp="false">A</property>
                </properties>
            </identification>
        </object>
        <object type="WebElement" technology="Web">
            <name>menuCart</name>
            <codeName>aMenuCartWebElement</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="AccessibilityName" type="string" isRegExp="false"></property>
                    <property name="Id" type="string" isRegExp="false">menuCart</property>
                    <property name="InnerText" type="string" isRegExp="false"></property>
                    <property name="TagName" type="string" isRegExp="false">svg</property>
                </properties>
            </identification>
        </object>
        <object type="Button" technology="Web">
            <name>save_to_cart</name>
            <codeName>aADD_TO_CART_button</codeName>
            <description></description>
            <identification>
                <properties>
                    <property name="ButtonType" type="string" isRegExp="false">submit</property>
                    <property name="Name" type="string" isRegExp="false">ADD TO CART</property>
                    <property name="TagName" type="string" isRegExp="false">BUTTON</property>
                </properties>
            </identification>
        </object>
    </objects>
</applicationModel>
