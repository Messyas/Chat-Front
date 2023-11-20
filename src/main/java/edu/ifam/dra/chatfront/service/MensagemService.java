package edu.ifam.dra.chatfront.service;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    private final MessageSource messageSource;

    public MensagemService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessage(String key) {
        return messageSource.getMessage(key, null, LocaleContextHolder.getLocale());
    }

    public String getMessage(String key, Object... params) {
        return messageSource.getMessage(key, params, LocaleContextHolder.getLocale());
    }
}
