package com.naver.hackathon.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NotificationTypesTest {

    private static final Logger log = LoggerFactory.getLogger(NotificationTypesTest.class);

    private NotificationTypes types;
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        this.types = NotificationTypes.MODIFIED;
        this.mapper = new ObjectMapper();
    }

    @Test
    public void enumValue_isCorrectlyMapped() {
        assertThat(types.getCaption(), is("공지사항이 수정되었습니다: "));
    }

    @Test
    public void enum_isMappedToJSONCorrectly() throws JsonProcessingException {
        log.error(this.mapper.writeValueAsString(this.types));
    }

}