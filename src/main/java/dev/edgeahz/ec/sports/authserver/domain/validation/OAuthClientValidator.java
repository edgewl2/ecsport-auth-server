package dev.edgeahz.ec.sports.authserver.domain.validation;

import dev.edgeahz.ec.sports.authserver.api.rest.dto.ClientRegistration;
import dev.edgeahz.ec.sports.authserver.domain.exception.ClientRegistrationException;
import dev.edgeahz.ec.sports.authserver.domain.model.OAuthClient;

import java.util.Set;
import java.util.regex.Pattern;

import static dev.edgeahz.ec.sports.authserver.api.rest.dto.ClientRegistration.*;

public class OAuthClientValidator {

    private static final Pattern URI_PATTERN = Pattern.compile("^https?://[\\w.-]+(:\\d+)?(/[\\w.-]*)*/?$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");


    public static void validate(OAuthClient client) {
        if (client == null) {
            throw new ClientRegistrationException("El cliente no puede ser nulo");
        }

        if (client.getClientName() == null || client.getClientName().trim().isEmpty()) {
            throw new ClientRegistrationException("El nombre del cliente es obligatorio");
        }

        if (client.getRedirectUris() == null || client.getRedirectUris().isEmpty()) {
            throw new ClientRegistrationException("Al menos una URI de redirección es obligatoria");
        }

        for (String uri : client.getRedirectUris()) {
            if (uri == null || uri.trim().isEmpty()) {
                throw new ClientRegistrationException("Las URIs de redirección no pueden estar vacías");
            }

            if (!URI_PATTERN.matcher(uri).matches()) {
                throw new ClientRegistrationException("Las URIs de redirección deben tener un formato válido");
            }
        }

        if (client.getScopes() == null || client.getScopes().isEmpty()) {
            throw new ClientRegistrationException("Al menos un scope es obligatorio");
        }

        if (client.getContacts() != null) {
            for (String email : client.getContacts()) {
                if (email == null || email.trim().isEmpty()) {
                    throw new ClientRegistrationException("Los contacts no pueden ser nulos");
                }

                if (!EMAIL_PATTERN.matcher(email).matches()) {
                    throw new ClientRegistrationException("Los correos electrónicos deben tener un formato válido");
                }
            }
        }

        Set<GrantTypesEnum> validGrantTypes = Set.of(
                GrantTypesEnum.AUTHORIZATION_CODE,
                GrantTypesEnum.IMPLICIT,
                GrantTypesEnum.PASSWORD,
                GrantTypesEnum.CLIENT_CREDENTIALS,
                GrantTypesEnum.REFRESH_TOKEN);
        if (client.getGrantTypes() != null) {
            for (String grantType : client.getGrantTypes()) {
                if (!validGrantTypes.contains(GrantTypesEnum.fromValue(grantType))) {
                    throw new ClientRegistrationException("Los tipos de concesión no pueden ser nulos");
                }
            }
        }
    }
}
