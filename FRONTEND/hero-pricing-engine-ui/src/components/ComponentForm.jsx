import { useEffect, useState } from "react";
import {
  addComponent,
  updateComponent,
} from "../services/componentService";

function ComponentForm({
  loadComponents,
  selectedComponent,
  setSelectedComponent,
}) {

  const [component, setComponent] = useState({

    name: "",

    category: "",

    currentPrice: "",

    active: true,

  });

  useEffect(() => {

    if (selectedComponent) {
      setComponent(selectedComponent);
    }

  }, [selectedComponent]);

  const handleChange = (e) => {

    const { name, value } = e.target;

    setComponent({

      ...component,

      [name]: value,

    });

  };

  const handleSubmit = (e) => {

    e.preventDefault();

    if (selectedComponent) {

      updateComponent(
        selectedComponent.componentId,
        component
      ).then(() => {

        loadComponents();

        setSelectedComponent(null);

        setComponent({
          name: "",
          category: "",
          currentPrice: "",
          active: true,
        });

      });

    } else {

      addComponent(component).then(() => {

        loadComponents();

        setComponent({
          name: "",
          category: "",
          currentPrice: "",
          active: true,
        });

      });

    }

  };

  return (

    <form onSubmit={handleSubmit}>

      <div className="row">

        <div className="col-md-3">

          <input
            type="text"
            className="form-control"
            placeholder="Component Name"
            name="name"
            value={component.name}
            onChange={handleChange}
            required
          />

        </div>

        <div className="col-md-3">

          <input
            type="text"
            className="form-control"
            placeholder="Category"
            name="category"
            value={component.category}
            onChange={handleChange}
            required
          />

        </div>

        <div className="col-md-3">

          <input
            type="number"
            className="form-control"
            placeholder="Price"
            name="currentPrice"
            value={component.currentPrice}
            onChange={handleChange}
            required
          />

        </div>

        <div className="col-md-3">

          <button className="btn btn-success w-100">

            {selectedComponent
              ? "Update Component"
              : "Add Component"}

          </button>

        </div>

      </div>

    </form>

  );

}

export default ComponentForm;