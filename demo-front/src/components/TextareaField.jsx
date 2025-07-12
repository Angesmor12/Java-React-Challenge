export default function TextareaField({value, setValue, placeholder, name, type}){
    return (
        <textarea rows={5} cols={5} defaultValue={value}  onChange={(e) => setValue(e.target.value)} name={name} className="login-form-input" type={type} placeholder={placeholder} />
    )
}