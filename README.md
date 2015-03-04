# StyleableOptionGroup for Vaadin 7

StyleableOptionGroup extends the OptionGroup of the core framework by allowing style names for each item.
```java
StyleableOptionGroup radioButtons = new StyleableOptionGroup();
radioButtons.addItem("red");
radioButtons.addItem("green");
radioButtons.addItem("blue");
radioButtons.setItemStyleName("red", "red");
radioButtons.setItemStyleName("green", "green");
radioButtons.setItemStyleName("blue", "blue");
```

```scss
.v-select-optiongroup {
	.v-select-option {
		&.red {
			color: desaturate(red, 25%);
		}
		&.green {
			color: desaturate(green, 25%);
		}
		&.blue {
			color: desaturate(blue, 25%);
		}
	}
}
``

![Screenshot](https://raw.githubusercontent.com/tehapo/StyleableOptionGroup/master/screenshot.png)

## Online demo

Try the add-on demo at http://teemu.app.fi/StyleableOptionGroup

## Download release

Official releases of this add-on are available at Vaadin Directory. 
For Maven instructions, download and reviews, go to https://vaadin.com/addon/styleable-optiongroup

## Building and running demo

```bash
mvn clean install
cd demo
mvn jetty:run
```

To see the demo, navigate to http://localhost:8080/

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

StyleableOptionGroup is written by Teemu Pöntelin.

