/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.google.opensource;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLQueryCollectionImpl/*</name>*/ 
    extends /*<extends>*/GTLQuery/*</extends>*/ 
    /*<implements>*/implements GTLQueryCollectionProtocol/*</implements>*/ {

    /*<ptr>*/public static class GTLQueryCollectionImplPtr extends Ptr<GTLQueryCollectionImpl, GTLQueryCollectionImplPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLQueryCollectionImpl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLQueryCollectionImpl() {}
    protected GTLQueryCollectionImpl(Handle h, long handle) { super(h, handle); }
    protected GTLQueryCollectionImpl(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pageToken")
    public native String getPageToken();
    @Property(selector = "setPageToken:")
    public native void setPageToken(String v);
    @Property(selector = "startIndex")
    public native NSNumber getStartIndex();
    @Property(selector = "setStartIndex:")
    public native void setStartIndex(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
