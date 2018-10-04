package com.blzkz.cdtproperties;

import com.appiancorp.ps.plugins.typetransformer.*;
import com.appiancorp.services.ServiceContext;
import com.appiancorp.suiteapi.expression.annotations.AppianScriptingFunctionsCategory;
import com.appiancorp.suiteapi.expression.annotations.Function;
import com.appiancorp.suiteapi.expression.annotations.Parameter;
import com.appiancorp.suiteapi.type.TypeService;
import com.appiancorp.suiteapi.type.TypedValue;

@AppianScriptingFunctionsCategory
public class CdtProperties {

	@Function
	public String[] getCdtProperties(ServiceContext sc, TypeService ts, @Parameter TypedValue cdt) {
		AppianTypeFactory tf = AppianTypeFactory.newInstance(ts);
		AppianObject appianObject = (AppianObject) tf.toAppianElement(cdt);
		return appianObject.keySet().toArray(new String[0]);
	}
}
