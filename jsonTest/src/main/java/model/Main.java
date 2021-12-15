package model;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Comment> comments = mapper.readValue(new File("E:\\json\\jsonTest.json"), new TypeReference<List<Comment>>() {
        });

        for (int i = 0; i < comments.size(); i++) {
            if (i == 0) {
                Comment comment = new Comment();
                mapper.writeValue(new File("jsonId1"), comments.get(0));
                comment = mapper.readValue(new File("jsonId1"), Comment.class);
                System.out.println(comment);
                continue;
            }
            if (i == 4) {
                Comment comment2 = new Comment();
                mapper.writeValue(new File("jsonId5"), comments.get(4));
                comment2 = mapper.readValue(new File("jsonId5"), Comment.class);
                System.out.println(comment2);
            }
        }
    }

}
