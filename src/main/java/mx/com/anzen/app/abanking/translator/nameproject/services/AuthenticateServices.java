/*
 * Copyright (c)  Oct 14, 2016 Anzen Soluciones S.A. de C.V.
 * Mexico D.F.
 * All rights reserved.
 *
 * THIS SOFTWARE IS  CONFIDENTIAL INFORMATION PROPIETARY OF ANZEN SOLUCIONES.
 * THIS INFORMATION SHOULD NOT BE DISCLOSED AND MAY ONLY BE USED IN ACCORDANCE THE TERMS DETERMINED BY THE COMPANY ITSELF.
 */
package mx.com.anzen.app.abanking.translator.nameproject.services;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;

import mx.com.anzen.app.abanking.common.beans.UserSession;
import mx.com.anzen.app.abanking.common.constants.MappingConstants;
import mx.com.anzen.app.abanking.common.translator.TranslatorConfigurationBase;
import mx.com.anzen.app.abanking.common.translator.exception.TranslatorException;
import mx.com.anzen.app.abanking.common.translator.util.AbankingAMQPConstants;

/**
 * TODO [Add comments of the type]
 * 
 * @author alexander TODO [Add your email] ...
 */
public class AuthenticateServices {

	private static final Logger LOG = LoggerFactory
			.getLogger(AuthenticateServices.class);

	/**
	 * TODO [Add comments of method]
	 * 
	 * @param {@link
	 * 			TODO[name of class]} [name of instance], [description] ...
	 * @return {@link Message<Map<String,Object>>}, TODO [Add description]
	 * @throws {@link
	 *             TODO[name of exception]} ...
	 * @see TODO[name of package].[name of class]#[method/field]([params if
	 *      method]) ...
	 */
	@ServiceActivator(inputChannel = "login", outputChannel = TranslatorConfigurationBase.MAP_RESPONSE_CHANNEL_NAME)
	public Message<Map<String, Object>> login(Map<String, Object> inputMap,
			@Headers Map<String, Object> headers) throws TranslatorException {

		LOG.info("Invoking login service "
				+ inputMap.get(MappingConstants.USER_LOGIN));
		Message<Map<String, Object>> messageReturn = null;

		LOG.info("Login Service is successful");
		return messageReturn;
	}

	/**
	 * TODO [Add comments of method]
	 * 
	 * @param {@link
	 * 			TODO[name of class]} [name of instance], [description] ...
	 * @return {@link Message<Map<String,Object>>}, TODO [Add description]
	 * @throws {@link
	 *             TODO[name of exception]} ...
	 * @see TODO[name of package].[name of class]#[method/field]([params if
	 *      method]) ...
	 */
	@ServiceActivator(inputChannel = "logout", outputChannel = TranslatorConfigurationBase.MAP_RESPONSE_CHANNEL_NAME)
	public Message<Map<String, Object>> logout(Map<String, Object> inputMap,
			@Header(AbankingAMQPConstants.SESSION) UserSession session)	throws TranslatorException {

		LOG.info("Invoking logout service " + session.getUserId().getLogin());
		Message<Map<String, Object>> messageReturn = null;

		LOG.info("Logout service is successful ");
		return messageReturn;

	}
}