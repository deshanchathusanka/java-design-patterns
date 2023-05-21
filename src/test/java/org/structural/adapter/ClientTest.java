package org.structural.adapter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.structural.adapter.Client;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ClientTest {
    @Spy
    Client client;

    @Test
    void testMethod()
    {
        assertThat(client.method()).isEqualTo("Hello");
    }
}
