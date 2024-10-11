import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.RomanArabicConverter;
public class RomanArabicConverterTest {


    /*
@author   $Baranska_Viktoriia
@project   $Roman_To_Integer
@class  $444A
@version  1.0.0
@since 29.09.2024 - 18.43
*/

        // Test 1: Просте перетворення
        @Test
        public void testBasicConversionX() {
            assertEquals(10, RomanArabicConverter.romanToArabic("X"));
        }

        // Test 2: Перетворення символу нижнього реєстру
        @Test
        public void testLowercaseInputL() {
            assertEquals(50, RomanArabicConverter.romanToArabic("l"));
        }

        // Test 3: Змішаний реєстр
        @Test
        public void testMixedCaseInputXV() {
            assertEquals(15, RomanArabicConverter.romanToArabic("xV"));
        }

        // Test 4: Складне число
        @Test
        public void testComplexNumeralXCIV() {
            assertEquals(94, RomanArabicConverter.romanToArabic("XCIV"));
        }

        // Test 5: Валідне повторення
        @Test
        public void testValidInputRepeatingNumeralsIII() {
            assertEquals(3, RomanArabicConverter.romanToArabic("III"));
        }

        // Test 6: Неправильні вхідні дані
        @Test
        public void testInvalidInputNonRomanCharacters() {
            assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.romanToArabic("ABC"));
        }

        // Test 7: Найбільша римська цифра
        @Test
        public void testLargestValidRomanNumeralMMMCMXCIX() {
            assertEquals(3999, RomanArabicConverter.romanToArabic("MMMCMXCIX"));
        }

        // Test 8: Найменша римська цифра
        @Test
        public void testSmallestValidRomanNumeralI() {
            assertEquals(1, RomanArabicConverter.romanToArabic("I"));
        }

        // Test 9: Пустий рядок
        @Test
        public void testEmptyStringThrowsException() {
            assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.romanToArabic(""));
        }

        // Test 10: Null вхідне значення
        @Test
        public void testNullInputThrowsException() {
            assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.romanToArabic(null));
        }

        // Test 11: Неправильна послідовність римських цифр
        @Test
        public void testInvalidRomanNumeralOrderThrowsException() {
            assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.romanToArabic("IIV"));
        }

        // Test 12: Неправильні символи
        @Test
        public void testInvalidSubtractiveNotationThrowsException() {
            assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.romanToArabic("IC"));
        }

        // Test 13: Перевірка на некоректне повторення
        @Test
        public void testInvalidRepeatingNumeralsIIII() {
            assertThrows(IllegalArgumentException.class, () -> RomanArabicConverter.romanToArabic("IIII"));
        }

        // Test 14: Коректне число з додаванням та відніманням
        @Test
        public void testLargeNumberWithSubtractiveNotation() {
            assertEquals(3888, RomanArabicConverter.romanToArabic("MMMDCCCLXXXVIII"));
        }

        // Test 15: Комбінація додавання і віднімання
        @Test
        public void testComplexCombinationMCMLXXXVI() {
            assertEquals(1986, RomanArabicConverter.romanToArabic("MCMLXXXVI"));
        }
    }