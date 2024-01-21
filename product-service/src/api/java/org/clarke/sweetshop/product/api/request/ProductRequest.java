package org.clarke.sweetshop.product.api.request;

import jakarta.validation.constraints.NotNull;

public record ProductRequest(@NotNull() String name, String description) {
}
