import api from "../api/api";

export const getConfigurations=()=>{

    return api.get("/configurations");

}

export const createConfiguration=(configuration)=>{

    return api.post("/configurations",configuration);

}

export const getConfiguration=(id)=>{

    return api.get(`/configurations/${id}`);

}

export const deleteConfiguration=(id)=>{

    return api.delete(`/configurations/${id}`);

}