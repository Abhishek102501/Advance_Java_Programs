package Java_15;

public class Text_Block {
public static void main(String[] args) {
	String html = """
			<html>
                  <body>
                      <h1>Hello</h1>
                  </body>
              </html>
			""";
	String message = """
			Line 1
			Line 2
			Line 3
			""";

			System.out.println(message);
			String json = """
				    {
				        "name": "Abhishek",
				        "age": 22
				    }
				    """;
			String str = """
					He said, \"Hello!\"
					""";
			String name = "Abhishek";

			String greeting = """
			Hello %s,
			Welcome!
			""".formatted(name);

			System.out.println(greeting);
}
}
