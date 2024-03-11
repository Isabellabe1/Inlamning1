package Inlämningsuppgift;


    import org.junit.Test;

    import static org.junit.Assert.assertEquals;

    public class TestLogic {

        @Test
        public void testEnglishToMorse(){
            Logic logic = new Logic();

            String testdata = "a";

            String expected = "*-";

            String actual = logic.getMorse(testdata.charAt(0));

            assertEquals(expected, actual);

        }

        @Test
        public void testMorseToEnglish(){
            Logic logic = new Logic();

            String testdata = "-***";

            String expected = "b";

            String actual = String.valueOf(logic.getEnglish(testdata));

            assertEquals(expected, actual);
        }

        @Test
        public void testCharactersToMorse(){
            Logic logic = new Logic();

            String testdata = "?";

            String expected = "**--**";

            String actual = logic.getMorse(testdata.charAt(0));

            assertEquals(expected, actual);
        }

        @Test
        public void testMorseToCharacter(){
            Logic logic = new Logic();

            String testdata = "**--**";

            String expected = "?";

            String actual = String.valueOf(logic.getEnglish(testdata));

            assertEquals(expected, actual);
        }


    }
